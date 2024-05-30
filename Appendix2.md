## Appendix: Common Regular Expressions

Here are some common regular expressions that cover many use cases:

1. **Digits**: `\d`
    - Matches any digit (0-9)
    - Example: `\d` matches "1", "2", "3" in "123abc"

2. **Non-digits**: `\D`
    - Matches any non-digit character
    - Example: `\D` matches "a", "b", "c" in "123abc"

3. **Whitespace**: `\s`
    - Matches any whitespace character (spaces, tabs, line breaks)
    - Example: `\s` matches spaces in "a b c"

4. **Non-whitespace**: `\S`
    - Matches any non-whitespace character
    - Example: `\S` matches "a", "b", "c" in "a b c"

5. **Word Characters**: `\w`
    - Matches any word character (alphanumeric + underscore)
    - Example: `\w` matches "a", "1", "_" in "a_1"

6. **Non-word Characters**: `\W`
    - Matches any non-word character
    - Example: `\W` matches "!", "@", " " in "a_1!"

7. **Start of Line**: `^`
    - Matches the start of a line
    - Example: `^The` matches "The" in "The quick brown fox"

8. **End of Line**: `$`
    - Matches the end of a line
    - Example: `dog$` matches "dog" in "The quick brown fox jumps over the lazy dog"

9. **Zero or More**: `*`
    - Matches 0 or more occurrences of the preceding element
    - Example: `a*` matches "", "a", "aa" in "aaa"

10. **One or More**: `+`
    - Matches 1 or more occurrences of the preceding element
    - Example: `a+` matches "a", "aa", "aaa" in "aaa"

11. **Optional**: `?`
    - Matches 0 or 1 occurrence of the preceding element
    - Example: `a?` matches "", "a" in "a"

12. **Exact Number**: `{n}`
    - Matches exactly n occurrences of the preceding element
    - Example: `a{3}` matches "aaa" in "aaa"

13. **At Least n**: `{n,}`
    - Matches n or more occurrences of the preceding element
    - Example: `a{2,}` matches "aa", "aaa" in "aaa"

14. **Between n and m**: `{n,m}`
    - Matches between n and m occurrences of the preceding element
    - Example: `a{1,2}` matches "a", "aa" in "aaa"

15. **Character Class**: `[abc]`
    - Matches any one of the characters a, b, or c
    - Example: `[abc]` matches "a", "b", "c" in "abc"

16. **Negated Character Class**: `[^abc]`
    - Matches any character except a, b, or c
    - Example: `[^abc]` matches "1", "2", "3" in "123"

17. **Any Character**: `.`
    - Matches any single character except newline
    - Example: `a.b` matches "a_b", "a b" in "a_b"

18. **Word Boundary**: `\b`
    - Matches a word boundary (the position between a word and a non-word character)
    - Example: `\bword\b` matches "word" in "a word in a sentence"

19. **Non-Word Boundary**: `\B`
    - Matches a position where a word character is not on a word boundary
    - Example: `\Bword\B` matches "word" in "password123"

20. **Email Address**: `^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$`
    - Matches valid email addresses
    - Example: `^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$` matches "test@example.com"

21. **Phone Number**: `^\\+?\\d{1,3}?[- .]?\\(?(\\d{1,4})\\)?[- .]?\\d{1,4}[- .]?\\d{1,4}[- .]?\\d{1,9}$`
    - Matches valid phone numbers
    - Example: `^\\+?\\d{1,3}?[- .]?\\(?(\\d{1,4})\\)?[- .]?\\d{1,4}[- .]?\\d{1,4}[- .]?\\d{1,9}$` matches "+1-800-555-5555"

22. **URL**: `(http|https)://[\\w\\-\\.]+(\\.[a-z]{2,3})+(/[\\w\\-\\.~]*)*`
    - Matches valid URLs
    - Example: `(http|https)://[\\w\\-\\.]+(\\.[a-z]{2,3})+(/[\\w\\-\\.~]*)*` matches "http://www.example.com"

23. **Date (YYYY-MM-DD)**: `^\\d{4}-\\d{2}-\\d{2}$`
    - Matches dates in the format YYYY-MM-DD
    - Example: `^\\d{4}-\\d{2}-\\d{2}$` matches "2023-05-12"

24. **Credit Card Number**: `^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35\\d{3})\\d{11})$`
    - Matches valid credit card numbers
    - Example: `^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35\\d{3})\\d{11})$` matches "4111111111111111"

These examples and common use cases should provide a comprehensive guide to understanding and using regular expressions in Java for various tasks.