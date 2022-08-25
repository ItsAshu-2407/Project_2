package Simple.mobilesMania;

import java.util.Comparator;

public class ramComparator implements Comparator <mobileDescription> {

	public int compare(mobileDescription md, mobileDescription md1) {
		if(md.mobileRam == md1.mobileRam)
			return 0;
		if(md.mobileRam > md1.mobileRam)
			return 1;
		else
			return -1;
	}
	
}
