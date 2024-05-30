# Tutorial for Regular Expressions in Java

## Introduction to Regular Expressions

Regular expressions (regex) are a powerful tool for matching patterns in text. They allow you to search, replace, and manipulate strings based on specific patterns.

In Java, regular expressions are supported through the `java.util.regex` package, which contains the `Pattern` and `Matcher` classes.

### Basic Syntax

- `.` - Matches any single character except newline
- `^` - Matches the beginning of a line
- `$` - Matches the end of a line
- `*` - Matches 0 or more occurrences of the preceding element
- `+` - Matches 1 or more occurrences of the preceding element
- `?` - Matches 0 or 1 occurrence of the preceding element
- `{n}` - Matches exactly n occurrences of the preceding element
- `{n,}` - Matches n or more occurrences of the preceding element
- `{n,m}` - Matches between n and m occurrences of the preceding element
- `[abc]` - Matches any one of the characters a, b, or c
- `[^abc]` - Matches any character except a, b, or c
- `[a-z]` - Matches any character from a to z
- `(pattern)` - Matches the pattern and captures it for back-referencing
- `|` - Acts as an OR operator

### Java Implementation

To use regular expressions in Java, you need to import the `java.util.regex.Pattern` and `java.util.regex.Matcher` classes.

## Basic Examples

### Example 1: Finding a Simple Pattern

```java
package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicPatternExample {
    public static void main(String[] args) {
        String text = "The rain in Spain falls mainly in the plain.";
        String patternString = "ain";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found pattern at index " + matcher.start() + ": " + matcher.group());
        }
    }
}
```

### Example 2: Replacing a Pattern

```java
package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Pattern;

public class ReplacePatternExample {
    public static void main(String[] args) {
        String text = "The rain in Spain falls mainly in the plain.";
        String replacedText = text.replaceAll("ain", "XYZ");

        System.out.println("Original text: " + text);
        System.out.println("Replaced text: " + replacedText);
    }
}
```

### Example 3: Validating an Email Address

```java
package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailExample {
    public static void main(String[] args) {
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String[] emails = {"test@example.com", "invalid-email", "another.test@domain.org"};

        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println("Is '" + email + "' a valid email? " + matcher.matches());
        }
    }
}
```

### Example 4: Extracting Numbers from a String

```java
package com.coherentsolutions.java.webauto.section03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersExample {
    public static void main(String[] args) {
        String text = "The price is 100 dollars and 50 cents.";
        String numberPattern = "\\d+";

        Pattern pattern = Pattern.compile(numberPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group());
        }
    }
}
```

## Advanced Examples

### Example 5: Finding Words in a String

```java
package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordsExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String wordPattern = "\\b\\w+\\b";

        Pattern pattern = Pattern.compile(wordPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found word: " + matcher.group());
        }
    }
}
```

### Example 6: Extracting Prices from a String

```java
package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPricesExample {
    public static void main(String[] args) {
        String text = "The total cost is $100.50 and the discount price is $75.25.";
        String pricePattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(pricePattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found price: " + matcher.group());
        }
    }
}
```

### Example 7: Replacing HTML Tags

```java
package com.coherentsolutions.java.webauto.section03.advanced;

import java.util.regex.Pattern;

public class ReplaceHTMLTagsExample {
    public static void main(String[] args) {
        String html = "<html><body><h1>Title</h1><p>Paragraph.</p></body></html>";
        String replacedHTML = html.replaceAll("<[^>]+>", "");

        System.out.println("Original HTML: " + html);
        System.out.println("Text without HTML tags: " + replacedHTML);
    }
}
```

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
    - Matches a word boundary (the position between a word and