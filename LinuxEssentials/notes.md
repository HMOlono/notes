# 📖 Linux Essentials Notes
## :large_blue_diamond: Module 1 - Introduction to Linux
When most people refer to Linux, they are really referring to a combination of software called **`GNU/Linux`**, which defines the operating system. **`GNU`** is the free software that provides open source equivalents of many common UNIX commands. The **`Linux`** part of this combination is the Linux kernel, which is the core of the operating system. The kernel is loaded at boot time and stays running to manage every aspect of the functioning system.

There are two basic types of interfaces available that allow you to interact with the operating system. The typical computer user today is most familiar with a **`graphical user interface (GUI)`**. The second type of interface is **`the command line interface (CLI)`**, a text-based interface to the computer. The CLI relies primarily on keyboard input. Everything the user wants the computer to do is relayed by typing commands rather than clicking on icons. 

Linux originally only runs on **`Intel 386`** PCs

## :large_blue_diamond: Module 2 - Operating Systems
**`Embedded Systems`** means that the system is designed to do a specific task on hardware optimized for only that purpose.

A distribution provide a **`Package Manager`** to add and remove software from the system.

In Linux, RPM can be defined as **`The Package Manager`** program for Red Hat Linux. 

The **`release cycle`** dictates how often the software is updated.

A **`maintenance cycle`** describes how long a version of software will be supported

A long software **`release cycle`** is: Valued by businesses that want stability.

Bundling utilities, management tools, and application software with a Linux kernel is called a **`Distribution of Linux`**

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

## :large_blue_diamond: Module 3 - Working in Linux
The following pieces of software deal **`with file sharing`**
* Samba
* Netatalk
* NFS

**`Samba`** is use to let a Linux machine share files with Windows clients and servers.

The **`Samba`** application is a File Server.

A **`Mail Transfer Agent`** primary purpose is to deliver mail between servers.

**`POP`** and **`IMAP`** are related to email.

When a computer boots, it can get its network information trough **`DHCP`**

Two characteristics of a **`package manager`** are:
* Downloads software from the Internet
* Keeps track of which files belong to which packages

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

## :large_blue_diamond: Module 4 - Open source Software and Licensing
**`Source code`** refers to a human-readable version of computer software.

A license where you don't have access to the source code is called: **`Closed source`**.

**`Open source means`** that you can view and modify the software's source code.

**`Open source licenses differ`** but generally agree that:
* You should have access to the source code of software
* You should be able modify the software as you wish

### :small_blue_diamond:1. Permissive Licenses (The "Business-Friendly" Model)
These are the most relaxed. They basically say: "You can do whatever you want with this code, including using it in private or commercial software, as long as you keep my name on it."

**`Key Philosophy`**: Total freedom of use.

**`Major Licenses`**: MIT, BSD, and Apache 2.0.

**`BSD and MIT`** are examples of permissive software licenses.

**`Why companies love them`**: A company can take an MIT-licensed tool, improve it, and sell it as a closed-source product without sharing their secret improvements.

The big difference between the **`GPLv2`** and **`BSD`** is that **`BSD`** has no copyleft provision

A **`permissive free software license`** means you can use the software for anything you want and places no restrictions on sharing modifications.

The **`Open Source Initiative (OSI)`** was founded by **`Bruce Perens`** and **`Eric Raymond`**

### :small_blue_diamond:2. Copyleft Licenses (The "Reciprocal" Model)
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

If a company makes a hardware firewall that runs a custom Linux kernel, the obligations under **`GPLv2`** are that you must make the source to your kernel available.

### :small_blue_diamond:3. Weak Copyleft (The "Compromise" Model)
This sits in the middle. It is usually designed for libraries (reusable components).

**`Key Philosophy`**: Allow free components to be used by everyone, but keep the components themselves free.

**`Major Licenses`**: LGPL (Lesser GPL) and MPL (Mozilla Public License).

**`How it works`**: You can use an LGPL library in a proprietary app without opening your app's code. However, if you modify the library itself, you must share those specific changes.

### :small_blue_diamond:4. Creative Commons. 
While GPL and MIT are for code, Creative Commons is for content (text, images, video, and documentation).

**`Creative Commons`** licenses allow to:
* Specify whether or not people may distribute changes.
* Specify whether or not changes must be shared.
* Allow or disallow commercial use.

## :large_blue_diamond: Module 5 - Command Line Skills
### :small_blue_diamond:Commands
A **`command`** is a software program that, when executed on the CLI, performs an action on the computer.

`command [options] [arguments]`

An **`argument`** can be used to specify something for the command to act upon. If the ls command is given the name of a directory as an argument, it lists the contents of that directory. In the following example, the /etc/ppp directory is used as an argument.

**`Options`** can be used with commands to expand or modify the way a command behaves. For example, using the -l option of the ls command results in a long listing, providing additional information about the files that are listed, such as the permissions, the size of the file and other information:

**`History`**: When a command is executed in the terminal, it is stored in a history list. This is designed to make it easy to execute the same command, later eliminating the need to retype the entire command.

**`History commands`**:
* `Up Arrow` = key displays the previous command on the prompt line.
* `history` command = view the history list of a terminal.
* `!#` = execute the desired command in the list (# number of the command)
* `!-n` = execute the nth command from the bottom of the history list.
* `!!` = execute the most recent command
* `![command]` = execute the most recent iteration of a specific command.

### :small_blue_diamond:Variables
A **`variable`** is a feature that allows the user or the shell to store data. This data can be used to provide critical system information or to change the behavior of how the Bash shell (or other commands) work. Variables are given names and stored temporarily in memory. There are two types of variables used in the Bash shell: **`local`** and **`environment`**.

#### :small_orange_diamond:Local Variables
Local or shell variables exist only in the current shell, and cannot affect other commands or applications. When the user closes a terminal window or shell, **`all of the variables are lost`**. They are often associated with user-based tasks and are lowercase by convention.

`variable=value` is used to set the value of a variable.

The `echo` command is used to display output in the terminal.

#### :small_orange_diamond:Environment Variables
**`Environment variables`**, also called **`global variables`**, are available system-wide, in all shells used by Bash when interpreting commands and performing tasks. The system automatically recreates environment variables when a new shell is opened.

The **`HISTSIZE`** variable defines how many previous commands to store in the history list. The command in the example below displays the value of the `HISTSIZE` variable:
```
sysadmin@localhost:~$ echo $HISTSIZE
1000
```
To modify the value of an existing variable, use the assignment expression:
```
sysadmin@localhost:~$ HISTSIZE=500                                            
sysadmin@localhost:~$ echo $HISTSIZE                              
500
```
The `env` command outputs a list of the environment variables. We can use a pipeline (|) with grep to search for specific variable.
```
sysadmin@localhost:~$ env | grep variable1
```
To export a variable we use the command export. Ex:
```
export *variable*
```
The export command can also be used to make a variable an environment variable upon its creation by using the assignment expression as the argument:
```
sysadmin@localhost:~$ export variable2='Else'
```
To change the value of an environment variable, we use the assignment expression:
```
sysadmin@localhost:~$ variable1=$variable1' '$variable2                
sysadmin@localhost:~$ echo $variable1                                   
Something Else
```

#### :small_orange_diamond:Path Variable
The **`path variable`** contains a list that defines with directories the shell looks in to find commands. The following command displays the path of the current shell:
```
sysadmin@localhost:~$ echo $PATH                                        
/home/sysadmin/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games
```
Each directory in the list is separated by a colon `:` character.

When updating the PATH variable, **`always include the current path`**, appending `$PATH` to the value in the assignment expression. 
```
sysadmin@localhost:~$ echo $PATH                                       
/usr/bin/custom:/home/sysadmin/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games                           
```
A variable name preceded by a dollar sign represents **`the value`** of the variable.

### :small_blue_diamond:Command Types
There are several different sources of commands within the shell of the CLI including **`*internal*, *external*, *aliases* and *functions*`**

The type command can be used to determine information about command type. Ex.
```
type command
```

#### :small_orange_diamond:Internal Commands
Also called **`built-in commands`**, internal commands are built into the shell itself. A good example is the `cd` (change directory) command as it is part of the Bash shell. 
```
sysadmin@localhost:~$ type cd                                     
cd is a shell builtin
```

#### :small_orange_diamond:External Commands
**`External commands`** are binary executables stored in directories that are searched by the shell. We use which to display the full path to the command in question:
```
sysadmin@localhost:~$ which ls                                       
/bin/ls                                                               
sysadmin@localhost:~$ which cal                                        
/usr/bin/cal
```
For external commands, the `type` command displays the location of the command:
```
sysadmin@localhost:~$ type cal                                      
cal is /usr/bin/cal
```
Using the -a option of the type command displays all locations that contain the command named:
```
sysadmin@localhost:~$ type -a echo                                      
echo is a shell builtin                                                
echo is /bin/echo
```
#### :small_orange_diamond:Aliases
An `alias` can be used to map longer commands to shorter key sequences, new aliases can be created using the following format, where name is the `name` to be given the alias and command is the `command` to be executed when the alias is run.
```
alias name=command
```
#### :small_orange_diamond:Functions
Functions can also be built using existing commands to either create new commands, or to override commands built-in to the shell or commands stored in files. Aliases and functions are normally loaded from the initialization files when the shell first starts.

To create a function, the following syntax is used:
```
function_name () 
{
   commands
}
```
Functions are useful as they allow for a set of commands to be executed one at a time instead of typing each command repeatedly. In the example below, a function called my_report is created to execute the ls, date, and echo commands.
```
sysadmin@localhost:~$ my_report () {                                            
> ls Documents                                                                  
> date                                                                          
> echo "Document directory report"                                              
> }    
```
Once a function is created, the **`function name`** may be invoked from the BASH prompt to execute the function:
```
sysadmin@localhost:~$ my_report                                                 
School            alpha-third.txt  hidden.txt    numbers.txt  spelling.txt      
Work              alpha.txt        letters.txt   os.csv       words             
adjectives.txt    animals.txt      linux.txt     people.csv                     
alpha-first.txt   food.txt         longfile.txt  profile.txt                    
alpha-second.txt  hello.sh         newhome.txt   red.txt                        
Wed Oct 13 06:54:04 UTC 2021                                                    
Document directory report                                                       
sysadmin@localhost:~$  
```

### :small_blue_diamond:Quoting
Quotation marks are used throughout Linux administration and most computer programming languages to let the system know that the information contained within the quotation marks should either be ignored or treated in a way that is very different than it would normally be treated.

There are three types of quotes that have special significance to the Bash shell: **`double quotes ", single quotes ', and back quotes ``**. Each set of quotes alerts the shell not to treat the text within the quotes in the normal way.

#### :small_orange_diamond:Double Quotes
Double quotes still allow for command substitution, variable substitution, and permit some other shell metacharacters that haven't been discussed yet. The following demonstration shows that the value of the PATH variable is still displayed:
```
sysadmin@localhost:~$ echo "The path is $PATH"                          
The path is /usr/bin/custom:/home/sysadmin/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games
```

#### :small_orange_diamond:Single Quotes
Single quotes prevent the shell from doing any interpreting of special characters, including globs, variables, command substitution and other metacharacters.

For example, to make the $ character simply mean a $, rather than it acting as an indicator to the shell to look for the value of a variable, execute the second command displayed below:
```
sysadmin@localhost:~$ echo The car costs $100                           
The car costs 00                                                        
sysadmin@localhost:~$ echo 'The car costs $100'                        
The car costs $100
```

#### :small_orange_diamond:Backlash Character
Also known as the **`Escape Character`**. Its primary job is to tell the system: "Hey, don't treat the next character literally; it has a special meaning," or conversely, "Treat this special character as plain text."
```
sysadmin@localhost:~$ echo The service costs \$1 and the path is $PATH
The service costs $1 and the path is /usr/bin/custom:/home/sysadmin/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games
```

#### :small_orange_diamond:Backquotes
*Backquotes*, or *backticks*, are used to specify a command within a command, a process called command substitution. This allows for powerful and sophisticated use of commands.
```
sysadmin@localhost:~$ echo Today is `date`                         
Today is Mon Nov 4 03:40:04 UTC 2018
```
### :small_blue_diamond:Control Statements 
**`Control statements`** allow you to use multiple commands at once or run additional commands, depending on the success of a previous command. Typically these control statements are used within scripts, but they can also be used on the command line as well.

#### :small_orange_diamond:Semicolon
The semicolon ; character can be used to run multiple commands, one after the other. Each command runs independently and consecutively; regardless of the result of the first command, the second command runs once the first has completed, then the third and so on.

#### :small_orange_diamond:Double Ampersand
The double ampersand **`&&`** acts as a logical "and"; if the first command is successful, then the second command will also run. If the first command fails, then the second command will not run.

#### :small_orange_diamond:Double Pipe 
The **`double pipe ||`** is a logical "or". Depending on the result of the first command, the second command will either run or be skipped.
With the double pipe, if the first command runs successfully, the second command is skipped; if the first command fails, then the second command is run.

## :large_blue_diamond: Module 6: Getting Help

UNIX is the operating system that Linux was modeled after. The developers of UNIX created help documents called **`man pages`** (short for manual pages).

Man pages are used to describe the **`features of commands`**. They provide a basic description of the purpose of the command, as well as details regarding available options.

To view a man page for a command, use the man command:
```
man command
```

To exit viewing a man page, use the **`Q`** key.

Man pages are broken **`into sections`**. Each section is designed to provide specific information about a command. 

Common *man* sections:
* NAME: Provides the name of the command and a very brief description   
* SYNOPSIS: Provides examples of how the command is executed.
* DESCRIPTION: Provides a more detailed description of the command.
* OPTIONS: Lists the options for the command as well as a description of how they are used. 
* FILES: Lists the files that are associated with the command as well as a description of how they are used.
* AUTHOR: Provides the name of the person who created the man page and (sometimes) how to contact the person.
* COPYRIGHT: Provides a basic copyright information.
* SEE ALSO: Provides you with an idea of where you can find additional information.

To search a man page for a term, type the / character followed by a search term, then hit **`Enter`** key.

By default, there are nine sections of man pages:
* General Commands
* System Calls
* Library Calls
* Special Files
* File Formats and Conventions
* Games
* Miscellaneous
* System Administration Commands
* Kernel Routines

The man command searches each of these sections in order until it finds the **`first match`**.

To search for man pages by name, use the *-f* option to the man command. It displays man pages **`that match, or partially match, a specific name`** and provide the section number and a brief description of each man page:
```
sysadmin@localhost:~$ man -f passwd                                    
passwd (5)           - the password file                              
passwd (1)           - change user password                           
passwd (1ssl)        - compute password hashes     
```
On most Linux distributions, the `whatis` command does the same thing as `man -f`. On those distributions both will produce the same output. 

To specify a different section, provide the **`number of the section`** as the first argument of the man command.
```
sysadmin@localhost:~$ man 5 passwd
```

The `-k` option to the man command searches both the **`names and descriptions`** of the man pages for a keyword.
```
sysadmin@localhost:~$ man -k copy                                               
cp (1)               - copy files and directories                               
cpgr (8)             - copy with locking the given file to the password or gr...
cpio (1)             - copy files to and from archives                          
cppw (8)             - copy with locking the given file to the password or gr...
dd (1)               - convert and copy a file                                  
debconf-copydb (1)   - copy a debconf database                                  
install (1)          - copy files and set attributes                            
scp (1)              - secure copy (remote file copy program)                   
ssh-copy-id (1)      - use locally available keys to authorize logins on a re...
```
On most Linux distributions, the `apropos` command does the same thing as `man -k`. On those distributions, both produce the same output.

To **`search for the location`** of a command or the man pages for a command, use the `whereis` command. 

To find any **`file or directory`**, use the `locate` command. This command searches a database of all files and directories that were on the system when the database was created.

Only the **`root user`** can search for any file in the locate database.

The `-c` option in the `locate` command shows hoy many **`files match`**.
```
sysadmin@localhost:~$ locate -c passwd                                 
98
```
### :small_blue_diamond: Info Documentation

To **`get help`** on using the info command execute: `man info` or `info info`

The `info` command also provides documentation on operating system commands and features. The goal is slightly different from man pages: **`to provide a documentation resource that gives a logical organizational structure, making reading documentation easier.`**

To display the info documentation for a command, use the info command.
```
sysadmin@localhost:~$ info ls       
```
To get help while using the info command, press SHIFT+H

Note that going into the node about sorting leads into a sub-node of the original. To **`go back to the previous node`**, use the **`U`** key. While U leads to the start of the node one level up, the **`L`** key returns **`to the same location`** as before entering the sorting node.

To see a listing of **`movement commands`** is hitting the `Shift+H` key. It also works for man pages.

To **`close`** the help screen type the `L` key which brings back the current document.

### :small_blue_diamond: Additional Sources of Help

Many commands will provide basic information, very similar to the SYNOPSIS found in man pages, by simply using the `--help` option to the command. This option is useful to learn the basic usage of a command quickly without leaving the command line:
```
sysadmin@localhost:~$  cat --help                                                
Usage: cat [OPTION]... [FILE]...                                                
Concatenate FILE(s) to standard output.                                         
                                                                                
With no FILE, or when FILE is -, read standard input.                           
                                                                                
  -A, --show-all           equivalent to -vET                                   
  -b, --number-nonblank    number nonempty output lines, overrides -n           
  -e                       equivalent to -vE                                    
  -E, --show-ends          display $ at end of each line                        
  -n, --number             number all output lines                              
  -s, --squeeze-blank      suppress repeated empty output lines                 
  -t                       equivalent to -vT                                    
  -T, --show-tabs          display TAB characters as ^I                         
  -u                       (ignored)                                            
  -v, --show-nonprinting   use ^ and M- notation, except for LFD and TAB        
      --help     display this help and exit                                     
      --version  output version information and exit                            
                                                                                
Examples:                                             
```
On most systems, there is a directory where additional documentation is found. The location of these files can vary depending on the distribution that you are using. Typical locations include /usr/share/doc and /usr/doc.

## :large_blue_diamond: Module 7 - Navigating the Filesystem

In Linux, **`everything is considered`** a file. Files are used to store data such as text, graphics, and programs.

In Linux the directory structure is typically called a *filesystem*, and has a top level (/) called the **`root directory`**.

Under the /home directory there is a directory for each user on the system. The directory name is the same as the name of the user (/home/user) and is represented with the **`tilde ~ character`**.

The `pwd` command prints the working directory, which is the current location of the user within the filesystem.
```
sysadmin@localhost:~$ pwd
/home/sysadmin
```

To navigate the filesystem, use the `cd` (change directory) command.

**`A path`** is a list of directories separated by the / character.

**`Absolute paths`** allow the user to specify the exact location of a directory. It always starts at the root directory, and therefore it always begins with the / character.

**`Relative paths`** start from the current directory. A relative path gives directions to a file relative to the current location in the filesystem.

Two period `..` characters always represents **`one directory higher`** relative to the current directory

The single period `.` character always represents **`the current directory`**

To display all files, including hidden files, use the `-a` option to the `ls` command.
```
sysadmin@localhost:~$ ls -a                                            
.             .bashrc   .selected_editor  Downloads  Public           
..            .cache    Desktop           Music      Templates         
.bash_logout  .profile  Documents         Pictures   Videos
```

### :small_blue_diamond: Long Display Listing

Each file has details associated with it called **`metadata`**. This can include information such as the size, ownership, or timestamps. To view this information, use the `-l` option to the ls command.

The following describes each of the fields of data in the output of the ls -l command:
```
-rw-r--r-- 1 root   root  15322 Dec 10 21:33 alternatives.log                   
drwxr-xr-x 1 root   root   4096 Jul 19 06:52 apt
```
#### :small_orange_diamond: File Type
The first character of each line indicates the type of file. The file types are:
| Symbol | File Type | Description |
| :--- | :--- | :--- |
| **`d`** | directory | A file used to store other files. |
| **`-`** | regular file | Includes readable files, image files, binary files, and compressed files. |
| **`l`** | symbolic link | Points to another file. |
| **`s`** | socket | Allows for communication between processes. |
| **`p`** | pipe | Allows for communication between processes. |
| **`b`** | block file | Used to communicate with hardware. |
| **`c`** | character file | Used to communicate with hardware. |
The first file alternatives.log is a **`regular file`** (-), while the second file apt is a **`directory`** (d).
#### :small_orange_diamond: Permissions
The next nine characters demonstrate the permissions of the file. Permissions indicate how certain users can access a file.
#### :small_orange_diamond: Hard Link Count
This number indicates how many hard links point to this file.
#### :small_orange_diamond: User Owner
Every file is owned by a user account. This is important because the owner has the rights to set permissions on a file.
#### :small_orange_diamond: Group Owner
Indicates which group owns this file. Any member of the group has a set of permissions on the file.
#### :small_orange_diamond: File size
Displays the size of the file in bytes. For directories, this value does not describe the total size of the directory, but rather how many bytes are reserved to keep track of the filenames in the directory.
#### :small_orange_diamond: Timestamps 
Indicates the time that the file's contents were last modified. For directories, this timestamp indicates the las time a file was added or deleted from the directory.
#### :small_orange_diamond: File Name
The final field contains the name of the file or directory.
___
To list the current directory but no the contents within it, use the list command with the -d and -l options. (ls -dl)
```
sysadmin@localhost:~$ ls -ld                                           
drwxr-xr-x 1 sysadmin sysadmin 224 Nov  7 17:07 .
```

There are times when you want to display all of the files in a directory as well as all of the files in all subdirectories under that directory. This is called a **`recursive listing`**.

To perform a recursive listing, use the -R option to the ls command:
```
sysadmin@localhost:~$ ls -R /etc/ppp
/etc/ppp:
ip-down.d  ip-up.d         

/etc/ppp/ip-down.d:
bind9

/etc/ppp/ip-up.d:
bind9
```
```
