package com.laurap.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Execute git stash in the console to store the uncommitted changes";
        String step2 = "Perform git checkout master to move to the local master branch";
        String step3 = "Execute git fetch command to see if there are any changes on remote/origin";
        String step4 = "Execute git pull - this will download the latest changes from origin/master to local master";
        String step5 = "Execute git branch New_Branch_Name to create new branch on local master";
        String step6 = "Perform git checkout New_Branch_Name as result we are rejectede to the created branch";
        String step7 = "Add the task related changes in the solution";
        String step8 = "Execute git commit command to the Intellij Idea to store the changes at a local level - on the current branch";
        String step9 = "Execute git push from Intellij Idea panel -as result a new remote branch is created with origin New_Branch_Name";
        String step10 = "Create a pull request origin/New_Branch_Name into master";
        String step11 = "Add the pull request details like name, description and review";
        String step12 = "If we collect at least 1 approval the we can merge the changes and continue with another task";
        String step13 = "Do not forget that locally you are still to the New_Branch_Name";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
    }
}
