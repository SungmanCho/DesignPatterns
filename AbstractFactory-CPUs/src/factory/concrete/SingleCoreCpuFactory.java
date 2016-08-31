package factory.concrete;

import factory.CpuFactory;
import product.AmdCpu;
import product.IntelCpu;
import product.concrete.AmdSingleCoreCpu;
import product.concrete.IntelSingleCoreCpu;

public class SingleCoreCpuFactory extends CpuFactory {

	@Override
	public IntelCpu createIntelCpu() {
		return new IntelSingleCoreCpu();
	}

	@Override
	public AmdCpu createAmdCpu() {
		return new AmdSingleCoreCpu();
	}

	
}
