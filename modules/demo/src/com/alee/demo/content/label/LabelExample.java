/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.demo.content.label;

import com.alee.demo.api.*;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.managers.style.StyleId;
import com.alee.utils.CollectionUtils;

import javax.swing.*;
import java.util.List;

/**
 * @author Mikle Garin
 */

public class LabelExample extends AbstractExample
{
    @Override
    public String getId ()
    {
        return "label";
    }

    @Override
    public FeatureType getFeatureType ()
    {
        return FeatureType.swing;
    }

    @Override
    protected List<Preview> createPreviews ()
    {
        final StyledLabel e1 = new StyledLabel ( "simple", FeatureState.updated, StyleId.label );
        final StyledLabel e2 = new StyledLabel ( "shade", FeatureState.updated, StyleId.labelShade );
        final StyledLabel e3 = new StyledLabel ( "tag", FeatureState.release, StyleId.labelTag );
        final StyledLabel e4 = new StyledLabel ( "vertical", FeatureState.release, StyleId.labelVertical );
        return CollectionUtils.<Preview>asList ( e1, e2, e3, e4 );
    }

    /**
     * Button preview.
     */
    protected class StyledLabel extends AbstractStylePreview
    {
        /**
         * Constructs new style preview.
         *
         * @param id           preview ID
         * @param featureState feature state
         * @param styleId      preview style ID
         */
        public StyledLabel ( final String id, final FeatureState featureState, final StyleId styleId )
        {
            super ( LabelExample.this, id, featureState, styleId );
        }

        @Override
        protected List<? extends JComponent> createPreviewElements ( final StyleId id )
        {
            final WebLabel label = new WebLabel ( getStyleId (), "Simple text" );
            final WebLabel icon = new WebLabel ( getStyleId (), "With icon", WebLookAndFeel.getIcon ( 16 ) );
            return CollectionUtils.asList ( label, icon );
        }
    }
}