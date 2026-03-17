# 📖 Linux Essentials Notes
## :small_blue_diamond:Modulo 1 - Introduction to Linux

When most people refer to Linux, they are really referring to a combination of software called **`GNU/Linux`**, which defines the operating system. **`GNU`** is the free software that provides open source equivalents of many common UNIX commands. The **`Linux`** part of this combination is the Linux kernel, which is the core of the operating system. The kernel is loaded at boot time and stays running to manage every aspect of the functioning system.

There are two basic types of interfaces available that allow you to interact with the operating system. The typical computer user today is most familiar with a **`graphical user interface (GUI)`**. The second type of interface is **`the command line interface (CLI)`**, a text-based interface to the computer. The CLI relies primarily on keyboard input. Everything the user wants the computer to do is relayed by typing commands rather than clicking on icons. 

Linux originally only runs on **`Intel 386`** PCs

## :small_blue_diamond:Modulo 2 - Operating Systems

**`Embedded Systems`** means that the system is designet to do a specific task on hardware opmitized for only that purpose.

A distribution provide a **`Package Manager`** to add and remove software from the system.

In Lunix, RPM can be defined as **`The Package Manager`** program for Red Hat Linux. 

The **`release cycle`** dictates how often the software is updated.

A **`maintenance cycle`** describes how long a version of software will be supported

A long software **`release cycle`** is: Valued by businesses that want stability.

Bundling utilities, managment tools, and application software with a Linux kernel is called a **`Distribution of Linux`**

A network of inexpensive computers connected to sensors and controllers is calle **`Internet of Thing (IoT)`**

**`IoT`** is one application of embedded systems

Distribution relations:
* Fedora, CentOS - RedHat
* Linux Mint - A fork of Ubuntu
* Ubuntu - Debian
* SUSE - Slackware

A **`Raspberry Pi`** is a series of small, low-cost, single-board computers (SBCs) developed in the UK by the Raspberry Pi Foundation.

A **`release cycle`** describes how often upgrades come out for software

A **`maintance cycle`** describes how long a version of software will be supported

If a software release is in a state in that it has many new features that have not been rigorously tested, it is typically referred to as **`beta software`**

Apple's OS X is a **`fully certified UNIX distribution`**

When a software supports old file formats or applications its called **`backward compatible`**

Microsoft Windows has a scripting environment called **`PowerShell`**, offers both **`desktop and server products`** and is generally **`backwards compatible`** with previous versions

**`When choosing`** a distribution of Linux, you should consider:  
* Will users require a GUI
* Does the distribution offer a "stable" version
* Does your organization require long-term support for the system
* If the application software is supported by the distribution
* Will commercial support be required for the OS

## :small_blue_diamond:Modulo 3 - Working in Linux

The following pieces of software deal **`with file sharing`**
* Samba
* Netatalk
* NFS

**`Samba`** is use to let a Linux machine share files with Windows clients and servers.

The **`Samba`** aplication is a File Server.

A **`Mail Transfer Agent`** primary purpose is to deliver mail between servers.

**`POP`** and **`IMAP`** are related to email.

When a computer boots, it can get its network information trough **`DHCP`**

Two characteristics of a **`package manager`** are:
* Downloads software from the Internet
* Keeps track of wich files belong to wich packages

The **`linux shell`**
* Allows you to launch programs
* Has a scripting language
* Is customizable

The two main families of Linux shells are **`Bourne Shell`** and **`C shell`**

In a graphical mode you can get to a shell by running **`Terminal`** and **`Xterm`**

**`Virtualization`** means a single host can be split up into multiple guests

Some characteristic of a **`multiuser operating system`** are:
* Many users can log in simultaneously with a unique account
* Users can protect their information from other users
* Resources are shared between users

The **`Tor Browser`** is a tool that helps anonymize the internet browsing

The two components that provide the ability to implement a firewall include: **`iptables`** and **`gufw`**

## :small_blue_diamond:Open source Software and Licensing

**`Source code`** refers to a human-readable version of computer software.

A license where you dont have access to the source code is called: **`Closed source`**.

**`Open source means`** that you can view and modify the software's source code.

**`Open source licenses differ`** but generally agree that:
* You should have access to the source code of software
* You should be able modify the software as you wish

### :small_orange_diamond:1. Permissive Licenses (The "Business-Friendly" Model)
These are the most relaxed. They basically say: "You can do whatever you want with this code, including using it in private or commercial software, as long as you keep my name on it."

**`Key Philosophy`**: Total freedom of use.

**`Major Licenses`**: MIT, BSD, and Apache 2.0.

**`BSD and MIT`** are examples of permissive software licenses.

The big difference between the **`GPLv2`** and **`BSD`** is that **`BSD`** has no copyleft provision

A **`permissive free software license`** means you can use the software for anything you want and places no restrictions on sharing modifications.

The **`Open Source Initiative (OSI)`** was founded by **`Bruce Perens`** and **`Eric Raymond`**

### :small_orange_diamond:2. Copyleft Licenses (The "Reciprocal" Model)
These are "protective" licenses. They say: "You can use and change this, but if you share your version with others, you must share your source code under these same rules."

**`Key Philosophy`**: Ensuring the software remains free forever.

**`Major Licenses`**: GPL (General Public License) and AGPL.

**`The "Viral" Effect`**: If you include GPL code in a project, your entire project usually becomes GPL. This prevents companies from "privatizing" open-source work.

**`Linux`** source code is available to anyone who has the knowledge needed to access it.

Linux is distributed under the **`GPLv2`**

**`GPLv3`** was made by the FSF.

**`GPL vs LGPL`**: You can link a proprietary (closed-source) program to an LGPL library without being forced to open-source your own program.

**`Copyleft`** means that if you redistribute the software, you must redistribute the source to any changes you make.

**`Richard Stallman`** is associated with **`The Free Software Foundation (FSF)`**.

**`The FSF`** believes that software should be free to modify and share.

If a company makes a hardware firewall that runs a custom Linux kernel, the obligations under **`GPLv2`** are that you must make the source to your kernel avaibale.

### :small_orange_diamond:3. Weak Copyleft (The "Compromise" Model)
This sits in the middle. It is usually designed for libraries (reusable components).

**`Key Philosophy`**: Allow free components to be used by everyone, but keep the components themselves free.

**`Major Licenses`**: LGPL (Lesser GPL) and MPL (Mozilla Public License).

**`How it works`**: You can use an LGPL library in a proprietary app without opening your app's code. However, if you modify the library itself, you must share those specific changes.

**`Why companies love them`**: A company can take an MIT-licensed tool, improve it, and sell it as a closed-source product without sharing their secret improvements.

4. Creative Commons. 
While GPL and MIT are for code, Creative Commons is for content (text, images, video, and documentation).

**`Creative Commons`** licenses allow to:
* Specify whether or not people may distribute changes.
* Specify whether or not changes must be shared.
* Allow or disallow commercial use.
