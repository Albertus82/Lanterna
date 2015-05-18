package it.albertus.test;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Map;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.ACS;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminal;
import com.googlecode.lanterna.terminal.swing.TerminalAppearance;
import com.googlecode.lanterna.terminal.swing.TerminalPalette;

public class LanternaTest {

	public static void main(String... args) throws InterruptedException, IOException {
		
	    Toolkit tk = Toolkit.getDefaultToolkit();
	    Map desktopHints = (Map) (tk.getDesktopProperty("awt.font.desktophints"));
		
//		System.setProperty("awt.useSystemAAFontSettings", "lcd");
//		System.setProperty("swing.aatext", "true");
	    TerminalAppearance ta = new TerminalAppearance(new Font("Consolas", Font.BOLD, 14), new Font("Consolas", Font.PLAIN, 13), TerminalPalette.WINDOWS_XP_COMMAND_PROMPT, true);
		
		
		
	    SwingTerminal terminal = TerminalFacade.createSwingTerminal(ta);

	
	    
	    
	    terminal.enterPrivateMode();
	    
	    Graphics2D graphics2D = (Graphics2D)terminal.getJFrame().getGraphics().create();

	    
	    
	    terminal.applyForegroundColor(0, 255, 0);
	    System.out.println(terminal.getTerminalSize());
	    for (int i=0;i<terminal.getTerminalSize().getRows()*terminal.getTerminalSize().getColumns()/2;i++) {
	    terminal.putCharacter((char)(32+65+Math.random()*26));
	    }
//	    terminal.clearSc
	    Thread.sleep(5000);
	    terminal.exitPrivateMode();
	    
	}
	

}
