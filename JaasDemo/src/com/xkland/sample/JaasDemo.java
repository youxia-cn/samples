package com.xkland.sample;

import java.security.Principal;
import java.util.Set;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import com.sun.security.auth.callback.DialogCallbackHandler;

public class JaasDemo {

	public static void main(String[] args) {
		LoginContext lc = null;
		try{
			lc = new LoginContext("JaasDemo", new DialogCallbackHandler());
		}catch(Exception e){
			System.err.println("无法创建 LoginContext ： " + e.getMessage());
			System.exit(-1);
		}
		//给用户 3 次认证机会
		int i;
		for(i =0; i < 3; i++){
			try{
				lc.login();
				//如果没有异常抛出，则认证通过
				break;
			}catch(Exception e){
				System.err.println("认证失败：" + e.getMessage());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					//ignore
				}
			}
		}
		if(i == 3){  //三次尝试都失败，则认证失败
			System.err.println("Sorry，连续三次尝试失败，程序退出！");
			System.exit(-1);
		}
		System.out.println("认证成功！");
		
		Subject mySubject = lc.getSubject();
		System.out.println("显示所有的 Principal ...");
		Set<Principal> principals = mySubject.getPrincipals();
		for(Principal principal : principals){
			System.out.println(principal.getClass().getName() + " : " + principal.getName());
		}
		//以认证通过的用户执行 SampleAction 中的任务，如果认证未通过，则执行不了
		try{
			Subject.doAsPrivileged(mySubject, new SampleAction(), null);
			System.exit(0);
		}catch(Exception e){
			System.err.println("Sorry，没有针对该用户的授权！" + e.toString());
			System.exit(-1);
		}
	}

}
