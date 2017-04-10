package br.dagostini.exemplos;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LerIp {

	public LerIp() {

		InetAddress IP;

		try {
			IP = InetAddress.getLocalHost();
			String IPString = IP.getHostAddress();
			System.out.println("Meu IP é: " + IP.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new LerIp();
	}
}
