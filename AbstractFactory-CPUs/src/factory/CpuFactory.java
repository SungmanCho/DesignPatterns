package factory;

import product.AmdCpu;
import product.IntelCpu;

public abstract class CpuFactory {

	public abstract IntelCpu createIntelCpu();
	public abstract AmdCpu createAmdCpu();
	
}
