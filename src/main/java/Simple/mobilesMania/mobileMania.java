package Simple.mobilesMania;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class mobileMania {
	public static void main(String[] args) {
		mobileDescription mobile1 = new mobileDescription(4, "SamsungZFold", 150000, 12, "One UI");
		mobileDescription mobile2 = new mobileDescription(14, "IPhone 14 Pro", 130000, 6, "Apple UI");
		mobileDescription mobile3 = new mobileDescription(12, "Redmi Note 12 Ultra", 110000, 12, "MIUI");
		mobileDescription mobile4 = new mobileDescription(10, "OnePlus 10t", 68000, 8, "Oxygen UI");
		mobileDescription mobile5 = new mobileDescription(8, "OPPO Reno 8 Pro", 70000, 8, "Color UI");

		ArrayList<mobileDescription> alt = new ArrayList<mobileDescription>();
		alt.add(mobile1);
		alt.add(mobile3);
		alt.add(mobile4);
		alt.add(mobile5);
		alt.add(mobile2);

		out.println("\t\t\t----Mobile Comparison on the basis of Price---");
		Collections.sort(alt, new priceComparator());
		for (mobileDescription mds : alt) {
			out.println(mds.mobileModelName+" will cost "+mds.mobilePrice+" which has "+mds.mobileRam+"GB RAM whose model number is "+mds.modelNumber+" and it's user interface is "+mds.userInterface+"\n");
		}
		out.println("\t\t\t----Mobile Comparison on the basis of Ram---");
		Collections.sort(alt, new ramComparator());
		for(mobileDescription mds : alt) {
			out.println(mds.mobileRam+" GB RAM will cost "+mds.mobilePrice+" which has "+mds.userInterface+" interface and it's model number is "+mds.modelNumber+" and model name is "+mds.mobileModelName+"\n");
		}
	}
}
