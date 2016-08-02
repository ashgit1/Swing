package com.ashish.swing.components;

public class Test {

	public static void main(String[] args) {

		String lgsDu = "lgsad102-des-apl-00";
        String lgsHost = lgsDu.split("-")[0];
        System.out.println("lghost : " + lgsHost );
        
        String name = String.format("LogAdmin Start Agent Host %s", lgsHost);
        
        String host = "mucimp01.os.amadeus.net";
        
        String command = String.format("sudo -u houston %s staagt -p %s --host %s",
                					"/ama/obe/IMP/logging/logadmin",
                					"DEV",
                					lgsHost);
        
        System.out.println("name : " + name);
        System.out.println("host : " + host);
        System.out.println("command : " + command);
        
	}

}
