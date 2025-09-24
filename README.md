
---

## ✅ EASY

| #  | Problem | Approaches | Complexity | LeetCode Link |
|----|----------|------------|------------|----------------|
| 1  | Find Duplicate Elements | Brute Force (O(n²)), HashSet, HashSet size check, HashMap count | Time: O(n) / Space: O(n) | [Find Duplicate](https://leetcode.com/problems/contains-duplicate/) |
| 2  | Two Sum | Brute Force, HashMap (Two-pass, One-pass) | Time: O(n) / Space: O(n) | [Two Sum](https://leetcode.com/problems/two-sum/) |
| 3  | Valid Anagram | Sort strings, HashMap frequency count | Time: O(n log n) or O(n) / Space: O(1) or O(n) | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) |
| 4  | Roman to Integer | HashMap lookup, Optimized Array lookup | Time: O(n) / Space: O(1) | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) |

---

## ⚡ MEDIUM

| #  | Problem | Approaches | Complexity | LeetCode Link |
|----|----------|------------|------------|----------------|
| 1  | Top K Frequent Elements | HashMap (count freq) + Min Heap / Bucket Sort | Time: O(n log k) or O(n) / Space: O(n) | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) |
| 2  | Group Anagrams | Sort string + HashMap.putIfAbsent | Time: O(n·k log k) / Space: O(n·k) | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) |

---

## 📝 Notes
- Bài **Find Duplicate** nên thử đủ cách để hiểu trade-off giữa Brute Force và Hashing.  
- Với **Two Sum**, một-pass HashMap là tối ưu (check + insert trong một vòng lặp).  
- **Roman to Integer**: dùng array lookup sẽ nhanh hơn HashMap vì tránh overhead.  
- **Top K Frequent**: bucket sort rất hiệu quả khi số lượng phần tử lớn.  
- **Group Anagrams**: `Arrays.sort()` + `String key = new String(sorted)` để group.  

---
