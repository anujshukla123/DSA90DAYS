# Day 0: Find the Largest and Second Largest Element in an Array

Welcome to Day 0 of the **DSA 90 Days Challenge** 🚀  
We're starting with a classic — finding the **largest** and **second largest** elements in an array. This problem helps you get comfortable with array traversal and conditional logic.

---

## 📌 Problem Statement

Given an array of integers, find:
- The **largest** element
- The **second largest** element (must be

🚀 Approach

    Traverse the array once (O(n) time complexity)

    Use two variables:

        largest

        secondLargest

    Update them on the fly as you iterate

    💡 Edge Cases

    All elements are the same ➡️ No second largest

    Array has less than 2 elements ➡️ Invalid input

    Array with negative numbers? ✅ Still works


✍️ Author

Anuj Shukla
Engineer | Problem Solver | Future SDE
Follow the journey on this repo for 90 days of pure DSA grind 💪


# 🚀 Day 1 – DSA 90 Days Challenge

Welcome to **Day 1** of my [DSA 90 Days Challenge](https://github.com/anujshukla123/DSA90DAYS). This challenge is all about building consistent habits, mastering problem-solving skills, and preparing for product-based company interviews.

---

## ✅ Today's Goals

- ✅ Get comfortable with basic array manipulation
- ✅ Solve 3 beginner-level problems
- ✅ Set up project structure and GitHub repo
- ✅ Start building consistency 💪

---

## 🔍 Problems Solved

| # | Problem Name                        | Difficulty | Platform | Link |
|---|-------------------------------------|------------|----------|------|
| 1 | Find Minimum and Maximum in Array  | Easy       | Custom   | N/A  |
| 2 | Reverse the Array                  | Easy       | Custom   | N/A  |
| 3 | Swap Alternate Elements            | Easy       | Custom   | N/A  |

> 📝 All problems are part of my warm-up before diving into LeetCode & other platforms. Focus is on logic clarity and code quality.

---

## 📂 Folder Structure

📘 Day 2 - String & Integer Manipulation

Welcome to Day 2 of the DSA 90 Days Challenge 🚀.
Today's focus: mastering foundational string and integer operations. These are must-haves for interviews at product-based companies.
✅ 1. Reverse Integer

Problem: Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range, return 0.

    LeetCode: Reverse Integer

    Category: Math, Edge Cases

    Example:

    Input: x = 123
    Output: 321

    Input: x = -120
    Output: -21

    Constraints:

        Must not convert to string for the logic.

        Handle overflow (Integer.MAX_VALUE, Integer.MIN_VALUE) safely.

📄 Java Code →
✅ 2. String to Integer (atoi)

Problem: Implement the myAtoi(String s) function to convert a string into a 32-bit signed integer.

    LeetCode: String to Integer (atoi)

    Category: Parsing, String Handling

    Example:

    Input: s = "   -42"
    Output: -42

    Input: s = "4193 with words"
    Output: 4193

    Steps:

        Ignore leading spaces

        Handle '+' / '-' sign

        Read digits only

        Clamp to 32-bit signed int range

📄 Java Code →
💡 Summary

These problems test your ability to:

    Parse and process characters in a string

    Handle integer boundaries (overflows/underflows)

    Think in edge cases before brute-forcing
