package org.launchcode.techjobs.console;

import java.util.Comparator;

public class JobsComparator implements Comparator<JobData> {

    @Override
    public int compare(JobData o1, JobData o2) {
        return o1.get;
    }

}
