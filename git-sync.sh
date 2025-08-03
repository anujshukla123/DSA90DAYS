#!/bin/bash

# 🚀 Auto Git Commit Script for DSA_90_DAYS

# Check for commit message
if [ -z "$1" ]; then
  echo "❌ Missing commit message."
  echo "✅ Usage: ./git-auto.sh \"Your commit message here\""
  exit 1
fi

echo "📦 Adding all files..."
git add .

echo "📝 Committing with message: \"$1\""
git commit -m "$1"

echo "🔄 Pulling latest changes from origin/main with rebase..."
git pull --rebase origin main

echo "🚀 Pushing to GitHub..."
git push origin main

echo "✅ Auto-commit complete!"
