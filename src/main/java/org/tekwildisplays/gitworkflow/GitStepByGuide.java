package org.tekwildisplays.gitworkflow;

public class GitStepByGuide {
    public static void main(String[] args) {
        String step1 = "Execute - git stash command in order to save the changes";
        String step2 = "Go to the main branch - git checkout master";
        String step3 = "Get the latest changes - sync with Origin/master - git fetch";
        String step4 = "Download the diffs - git pull";
        String step5 = "Create a new dedicated branch for the task - git checkout -b Branch_name";
        String step6 = "Add code changes for implementing the required task";
        String step7 = "Save the chenges on local memory - git commit";
        String step8 = "Upload the changes on the cloud - git ";
        String step9 = "Go to the GitHub repository";
        String step10 = "Create a new Pull Request into the origin/master branch";
        String step11 = "Invite the collaborators to review the code";
        String step12 = "If you collect at least 2 approvals from your colleagues then merge the branch";
        String step13 = "After that, the origin/master contains the lastes changes and the origin/new_branch_name can be deleted";
        String step14 = "Do not forget that locally you are still on the new_branch_name, it's good to move back to master";
        String step15 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";

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
        System.out.println(step14);
        System.out.println(step15);
    }
}
