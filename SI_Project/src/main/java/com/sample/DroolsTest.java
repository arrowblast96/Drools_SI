package com.sample;

import java.time.temporal.ChronoUnit;

import java.util.Calendar;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	
            kSession.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

	public static Calendar calendar(int i, int j, int k) {
		Calendar date=Calendar.getInstance();
		date.set(i, j, k);
	
		return date;
	}
	public static long diffDays(Calendar start,Calendar end)
	{
		long diff=ChronoUnit.DAYS.between(start.toInstant(), end.toInstant());
		return diff;
		
	}

}
