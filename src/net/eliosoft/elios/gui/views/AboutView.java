/*
 * This file is part of Elios.
 *
 * Copyright 2010 Jeremie GASTON-RAOUL & Alexandre COLLIGNON
 *
 * Elios is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Elios is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Elios. If not, see <http://www.gnu.org/licenses/>.
 */

package net.eliosoft.elios.gui.views;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The view of the About.
 * This view displays the About of the project.
 *
 * @author Jeremie GASTON-RAOUL
 */
public class AboutView implements ViewInterface {

	private final JPanel aboutPanel = new JPanel();

	/**
	 * The constructor of the class.
	 */
	public AboutView() {
		JLabel titleLabel = new JLabel("<html><body>" +
				"<h1 align='center'>Elios v0.1</h1>" +
				"<p align='center'>Elios is<br/>" +
				"a free and cross-platform remote<br/>" +
				"developed to help technicians<br/>" +
				"during lighting setup and focus !!!</p>" +
				"<p></p>" +
				"<p align='center'>Copyright &copy; 2010<br/>J&eacute;r&eacute;mie GASTON-RAOUL<br/>Alexandre COLLIGNON</p>" +
				"</body></html>");
		aboutPanel.add(titleLabel);
	}

	/**
	 * Returns the about panel
	 * @return the view component
	 */
	public JComponent getViewComponent() {
		return this.aboutPanel;
	}

}