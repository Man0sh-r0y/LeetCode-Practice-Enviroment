# Leetcode Problem Solving Enviromenet
If you are looking for a setup that looks like the one below, the following instructions might help you to configure this on your workstation.

1. Go to `view`
1. Then to `editor layout`
1. click on `split left`

This will separate the main Java file to the left from the input and output files. Now, to split input and output in two sections, have your cursor on input.txt file and then follow the same steps:

1. Go to `Editor Layout`
1. Then to `Split Down`

Since we have created and aligned the input and output files, we have to run these files. To make sure our input gives an output, we will have to configure it. 
1. Go to `Terminal`
1. select `Configure Tasks`
1. choose `Create tasks.json file from the template`
1. then select `others`

After selecting others, you will see a new .vscode file and, in that, a tasks.json file, clear the current text in the json file and paste this.

## Fr Windows/Linux Users:

```bash
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "Compile and run",
            "type": "shell",
            "command": "javac",
            "args": [
                "${relativeFile}",
                "&&",
                "java",
                "${fileBasenameNoExtension}",
                "<",
                "input.txt",
                ">",
                "output.txt"
            ],
            "presentation": {
                "reveal": "never"
            },
            "group": {
                "kind": "build",
                "isDefault": true
            },
            "problemMatcher": {
                "owner": "py",
                "fileLocation": [
                    "relative",
                    "${workspaceRoot}"
                ],
                "pattern": {
                    "regexp": "^(.*):(\\d+):(\\d+):\\s+(warning|error):\\s+(.*)$",
                    "file": 1,
                    "line": 2,
                    "column": 3,
                    "severity": 4,
                    "message": 5
                }
            }
        }
    ]
}
```

## For Mac Users:

```bash
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "compile and run",
            "type": "shell",
            "command": "javac ${file} && java ${fileBasenameNoExtension} < input.txt > output.txt",
            "group": {
                "kind": "build",
                "isDefault": true
            }
        }
    ]
}
```

## How to run the code?

Press `Ctrl` + `Shift` + `B` (Windows/Linux) or `Cmd` + `Shift` + `B` (macOS) to trigger the build task. This will compile and run your Java code according to the specified task configuration.
