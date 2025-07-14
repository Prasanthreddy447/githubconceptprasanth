package githubconceptt;

public class GITHUB {
	
	/*
	 github
	 --------
	                   add                   commit                          push
	 working directory-------->staging area---------------->local repo(.git) --------->github
	                                                                          fetch
	                                                                          
	  first create project in eclipse (project is ready to push into github)
	  in eclipse only we will have git in search
	  then right click on project --> team--> share project --> create new repositary i.e local git repostiry in eclipse (no code here) 
	  select box create repo --> create repo(.git) -->finish  so now in git repo project added
	    
      right click on project and team--> add to index(this will go to staging)  
      
      now again right click on project team-->commit and add comment then it will change from staging to local git(local git repo will have code)
      
      now after commit in local git repo under  branches master will come
      
      now goto git hub and create repoosity and copy the url
      
      right click on project team--> remote-->push the we will get desitination repo their we will add github created url
      
      and give user name and password here password or github token
      
      we will get push specfications    then we give master  add spec  finish
      
      */
	
	/*
	 now another tester comes to picture
	 now lead will give git repo url and ask here clone it and make changes
	 
	 now what will tester do?
	 in eclipse search for git repo
	 then clone the repo by given by  the manger given git hub repo url give username and passowrd finish
	 now in git repo (local git repo ) code will be cloned
	 
	 now import to local eclipse
	 
	 go to file --> import -->git--> project from git--> existing git
	 
	 now project will in local eclipse
	 
	 lets change anything or update the code
	 
	 so after the updated code right click on project --> team-->add to index(directory to staging area code has moved)
	 
	  before commiting testers should create the branch why we should create branch ?
	  
	  we will push our ode to branch and lead will check the code if it is okay then mergse the code to the master branch
	  
	   how to create branch, go to git repo in eclipse branch --> switch to--> new branch--> PR branch
	   
	   team--> commit -->update comment and commit
	   
	   now goto created branch and then push the code give as branch u want push
	   
	   manger should give permission
	   settings --->collabrator --> add people
	   
	   then go to branch in tester git repo and then goto pull request then their we will have commited code 
	   and start the conversation and ask lead to check the code 
	   
	   and then go to leads git repo go to testers branch and check the code and required comment 
	   
	   merge the code to master
	   
	 git
	 
	 */

}
