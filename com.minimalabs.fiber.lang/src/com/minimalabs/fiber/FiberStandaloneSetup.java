
package com.minimalabs.fiber;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FiberStandaloneSetup extends FiberStandaloneSetupGenerated{

	public static void doSetup() {
		new FiberStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

