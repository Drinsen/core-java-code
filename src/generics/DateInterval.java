package generics;

import java.time.LocalDate;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-02-26 16:04:34
 * @Version: V1.0
 */

public class DateInterval extends Pair<LocalDate> {
    @Override
    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >=0 ){
            super.setSecond(second);
        }
    }
}
