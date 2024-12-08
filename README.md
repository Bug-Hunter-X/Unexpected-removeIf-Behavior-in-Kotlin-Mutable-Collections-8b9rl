# Unexpected removeIf Behavior in Kotlin Mutable Collections

This repository demonstrates a subtle, yet potentially problematic, difference in how `removeIf` behaves when used with `MutableList` and `MutableMap` in Kotlin.  The provided code showcases this behavior and offers a solution for maintaining consistency.

## Issue
The predicate function passed to `removeIf` receives a different argument type for lists versus maps. For lists, it receives the element itself. For maps, it receives the entry (key-value pair). This difference can lead to unexpected behavior if the code isn't written carefully to account for this discrepancy.

## Solution
The solution ensures that `removeIf` is used in a manner consistent with both lists and maps.

## How to run
1. Clone this repository.
2. Open the project in your favorite Kotlin IDE.
3. Run the main function in each of the `.kt` files to see the unexpected behaviour and then the corrected version.