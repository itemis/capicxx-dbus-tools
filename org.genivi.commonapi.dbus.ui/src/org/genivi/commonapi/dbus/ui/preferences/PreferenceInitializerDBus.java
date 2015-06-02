/*
 * Copyright (C) 2013 BMW Group Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de) This Source Code Form is
 * subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the
 * MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */

package org.genivi.commonapi.dbus.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.genivi.commonapi.dbus.preferences.PreferenceConstantsDBus;
import org.genivi.commonapi.dbus.ui.CommonApiDBusUiPlugin;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializerDBus extends AbstractPreferenceInitializer
{

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
     * initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences()
    {
        IPreferenceStore store = CommonApiDBusUiPlugin.getDefault().getPreferenceStore();
        store.setDefault(PreferenceConstantsDBus.P_LICENSE_DBUS, PreferenceConstantsDBus.DEFAULT_LICENSE);
        store.setDefault(PreferenceConstantsDBus.P_OUTPUT_PROXIES_DBUS, PreferenceConstantsDBus.DEFAULT_OUTPUT);
        store.setDefault(PreferenceConstantsDBus.P_OUTPUT_STUBS_DBUS, PreferenceConstantsDBus.DEFAULT_OUTPUT);
        store.setDefault(PreferenceConstantsDBus.P_GENERATEPROXY_DBUS, true);
        store.setDefault(PreferenceConstantsDBus.P_GENERATESTUB_DBUS, true);
    }

}
