/*
* generated by Xtext
*/
package com.minimalabs.fiber;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FiberUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.minimalabs.fiber.ui.internal.FiberActivator.getInstance().getInjector("com.minimalabs.fiber.Fiber");
	}
	
}