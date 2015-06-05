package com.alee.laf.colorchooser;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;

/**
 * Simple ColorChooserPainter adapter class.
 * It is used to install simple non-specific painters into WebColorChooserUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveColorChooserPainter<E extends JColorChooser, U extends WebColorChooserUI> extends AdaptivePainter<E, U>
        implements ColorChooserPainter<E, U>
{
    /**
     * Constructs new AdaptiveColorChooserPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveColorChooserPainter ( final Painter painter )
    {
        super ( painter );
    }
}