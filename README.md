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


Day 3 Breakdown (DSA + Java + Debug Mindset)
✅ 1. DSA Focus – Pattern: Two Pointers / In-Place Modification

We're sticking with in-place modification problems for now, to solidify pointer intuition. Here's your problem list:
🚀 Problem 1: Remove Duplicates from Sorted Array

    Pattern: Two Pointers

    Goal: Keep unique elements at the front. Return length k.

    Approach: i tracks the last unique; j scans.

🚀 Problem 2: Move Zeroes

    Pattern: Two Pointers (non-zero collector)

    Goal: Move all 0s to end while keeping order.

    Hint: Same logic as filtering array in-place.

🧠 Problem 3: Max Consecutive Ones

    Pattern: Sliding Window / Counting

    Input: binary array

    Output: longest streak of 1s

    ✅ 2. Java Practice – In-place & Edge Cases

Java Concept Focus: Arrays, Loops, Substring, System.arraycopy() (read, don't use yet), StringBuilder (next few days)

Try to implement:

    removeElement()

    moveZeroes()

    gcdOfStrings()
    With:

    Zero external libraries

    Debug print statements

    Manual dry runs

✅ 3. Thinking Skill – Develop Pattern Matching

Every time you solve a problem:

    Ask yourself: "What’s the category of this?"

    Maintain a DSA pattern map like:

    Two Pointers → remove element, move zeroes, sorted duplicate remover
        GCD String → math pattern + string logic
        Sliding Window → max consecutive ones, max sum subarray

🍎 Problem Summary: Fruit Into Baskets

You're given an array fruits[], each number = type of fruit on that tree.
You're allowed to carry only 2 types (like having 2 fruit baskets).
Goal: Find the longest contiguous subarray where there are only 2 types of fruits.
🔍 Step-by-Step Thinking (Pattern: Sliding Window)
🧠 Key Observations:

    You must take every fruit from the starting index until you hit a 3rd type.

    So, you’re basically looking for the longest subarray with at most 2 distinct integers.

💡This is literally a sliding window with a hashmap/frequency counter.
✅ Strategy (High-Level):

    Use two pointers: start and end for the sliding window.

    Keep a Map<Integer, Integer> to track fruit counts in the current window.

    Expand end to the right:

        Add fruit to the map and increase count.

    If map has more than 2 keys:

        Shrink from the left (start) until only 2 keys remain.

    Track the max window size.

    Input: [1,2,1]
Window: [1,2,1] → only 2 types → return 3 ✅

Input: [1,2,3,2,2]
→ [2,3,2,2] is longest with 2 types → return 4 ✅
