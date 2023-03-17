Install the Eclipse Modelling Tools. Any recent distribution should work (The work is built on ECLISPE Version: 2021-03 (4.19.0)). Link: https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-modeling-tools

Launch your eclipse and install Linkage Generator Tool from the following update site:

- Link: http://vasco.imag.fr/tools/meeduse/LinkageGeneratorTool

1. Create a Modeling Project

- Click on File -> Other -> Sirius -> Modeling Project -> Next, then give a project name TestLift

2. Create the Pattern-Definition File

- Click on TestLift Folder -> New -> File then give the name lift.lnk , here Eclispe asks you to convert TestLift to an Xtext project, click Yes.

- Now you can define patterns in the file. Ctrl+space will guides you to fill syntex. Since we are working on lift example, copy and paste the content of ![File](Experiments/Lift/lift.lnk) and save (CTRL+S).



3. Create the Pattern Application File

- We defined the patterns in previous file, here we create a pattern application file, for this, click again on the TestLift folder -> New -> File then give the name lift.apn , copy and paste the content of ![File](Experiments/Lift/lift.apn)  which define the structure of linkage machine and apply the patterns defined previously and now you can save Ctrl+S.


4. Now your both files are ready, now its time to generate the linkage B specification. But due to some technical reasons in Eclispe, at this moment, we have to close and reopen the project. 

- Click TestLift -> click clsoe proejct and again click TestLift folder and -> click open project. Now lift.lnk and lift.apn are converted to modeling files. 

- To generate the linkage B specification, -> left click on lift.apn, the model will show the "Application RefinementInclusion", -> right click on it and click Generate. It will generate linkage_lift.ref in TestLift Folder.