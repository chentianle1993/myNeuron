/**
 * 
 */
package com.github.chentianle1993.simpleNeuron;

/**
 * @author chentianle
 *
 */
public class Connection {
	private double x;
	private double weight=0;
	
	//weight Range
	private double weightLow;
	private double weightHigh;
	
	private Neuron neuronIn;
	private Neuron neuronOut;
	

	/**
	 * 
	 */
	public Connection() {
		
	}
	
	public double getOutput() {
		return x * weight;
	}
	
	
}
