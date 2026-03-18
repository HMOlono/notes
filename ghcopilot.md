# Workflow: GitHub Copilot CLI Commits 🤖

This repository uses **GitHub Copilot CLI** for AI-powered git commit message generation.

## How it works
1. Changes are made to files (Markdown, Scripts, etc.).
2. They are staged using `git add .`.
3. The custom alias `ghcc` (GitHub Copilot Commit), defined in `.bashrc`, is executed.

## The Magic Alias
The command filters Copilot API metadata to extract only the message suggestion:
- **Tool:** `gh copilot`
- **Alias:** `ghcc`
- **Model:** Claude-Haiku (via GitHub)
- **Filter:** Custom bash scripting (grep/tail) for clean output.

---
*This file confirms that the workflow with Copilot CLI is fully operational*
