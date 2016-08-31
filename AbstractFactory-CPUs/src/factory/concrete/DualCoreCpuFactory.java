package factory.concrete;

import factory.CpuFactory;
import product.AmdCpu;
import product.IntelCpu;
import product.concrete.AmdDualCoreCpu;
import product.concrete.IntelDualCoreCpu;

public class DualCoreCpuFactory extends CpuFactory {

	@Override
	public IntelCpu createIntelCpu() {
		return new IntelDualCoreCpu();
	}

	@Override
	public AmdCpu createAmdCpu() {
		return new AmdDualCoreCpu();
	}

	
}
