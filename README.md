This repository will be used to host various Java projects which demonstrate the recipes contained in "Java Cookbook 2nd. Edition" by Ian F. Darwin.

I will separate each concept by a separate Java project, so branching the entire repository is unneccesary if you wish to view a single example.

The code for all examples was written in NetBeans on an Ubuntu 14.04 VM.

-Ryan Rasti

<h2>AntBuildExample</h2>

This project demonstrates how to edit a build.xml file using Ant syntax, which is useful in automating the compilation, build, or deployment tasks in java.

The repository already contains a "build/" folder, which is created after the build.xml file is run by Ant, but if you remove this directory and run the project, it will be regenerated with the relevant Java classfiles.
