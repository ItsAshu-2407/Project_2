package Simple.mobilesMania;

import java.util.Comparator;

public class priceComparator implements Comparator<mobileDescription> {

	public int compare(mobileDescription o1, mobileDescription o2) {
		if (o1.mobilePrice == o2.mobilePrice)
			return 0;
		if (o1.mobilePrice > o2.mobilePrice)
			return 1;
		else
			return -1;
	}

}
