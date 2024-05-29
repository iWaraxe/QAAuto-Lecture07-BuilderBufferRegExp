# Lecture 7: Strings, StringBuilder, StringBuffer, regular expressions

## Strings and Methods of the String Class

### `indexOf(char ch)`
Returns the index of the first occurrence of the specified character in this string.

```java
int index = "Mama".indexOf('r');
System.out.println(index);
```

### `replace(char oldChar, char newChar)`
Returns a new string resulting from replacing all occurrences of `oldChar` in this string with `newChar`.

```java
String str = "Hello";
String s = str.replace('H', 'Б');
System.out.println(s);
```

### `replaceAll(String regex, String replacement)`
Replaces each substring of this string that matches the given regular expression with the given replacement. This method allows replacing words in a string.

```java
String str = "Hello, I am an autotester!";
String s = str.replaceAll("am ", "will be ");
System.out.println(s);
```

### `startsWith(String prefix)`
Checks if this string starts with the specified prefix, beginning from the specified index or from the start (by default).

```java
String str = "Hello, I am an autotester!";
boolean bool = str.startsWith("Hello");
System.out.println(bool);
```

### `substring()`
Returns a new string that is a substring of this string. There are two variations:

```java
public String substring(int beginIndex) 
public String substring(int beginIndex, int endIndex)

String str = "Hello, I am an autotester!";
String subStr = str.substring(7);
System.out.println(subStr);

String str = "Hello, I am an autotester!";
String subStr = str.substring(0, 5);
System.out.println(subStr);
```

### `toUpperCase()`, `toLowerCase()`

```java
public String toLowerCase()
public String toLowerCase(Locale locale)
```

### `charAt(int index)`
Returns the character at the specified index. String indices in Java start from zero.

```java
String str = "Hello, I am an autotester!";
for (int i = 0; i < str.length(); i++) {
    System.out.print(str.charAt(i) + " ");
}
```

### `trim()`
Returns a copy of the string with leading and trailing whitespace omitted.

```java
String str = "   Hello, I am an autotester!   ";
System.out.println("\"" + str.trim() + "\"");
```

### `valueOf()`
Returns the string representation of the passed argument.

```java
String num = String.valueOf(555); 
String doubl = String.valueOf(555.55); 
String ch = String.valueOf('c'); 
int intNum = Integer.valueOf("555");
```

### `compareTo()`
Lexicographically compares two strings.

- `compareTo()` returns 0 if the argument string is equal to this string, a value less than 0 if this string is lexicographically less than the argument string, and a value greater than 0 if this string is lexicographically greater than the argument string.

```java
String str = "Мама";
String str2 = "мама";
System.out.println(str.compareTo(str2));
```

#### Example of Sorting a String Array:

```java
String[] strArray = {"Мама", "Папа", "Бабушка", "Дедушка"};
Arrays.sort(strArray);
printArray(strArray);

// Method to print array
public static void printArray(String[] array) {
    for (String str : array) {
        System.out.println(str);
    }
}
```

#### Sorting in Descending Order:

```java
String[] strArray = {"Мама", "Папа", "Бабушка", "Дедушка"};
Arrays.sort(strArray, new Comparator<String>() {
    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
});
```

### Creating String Formats

```java
public static int getSum(int a, int b) {
    int sum = a + b;
    System.out.printf("Sum of variable %s and variable %s is %s \n", a, b, sum);
    return sum;
}

public static int getSum(int a, int b) {
    int sum = a + b;
    String str = String.format("Sum of variable %s and variable %s is %s \n", a, b, sum);
    System.out.printf(str);
    return sum;
}
```

## StringBuilder and StringBuffer Classes and Methods

StringBuffer and StringBuilder classes in Java are used when there is a need to make a lot of modifications to the string of characters. Unlike strings, objects of type StringBuffer and StringBuilder can be modified multiple times without leaving behind many new unused objects.

StringBuilder was introduced in Java 5. The main difference between StringBuffer and StringBuilder is that the methods of StringBuilder are not thread-safe (not synchronized). It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. However, if thread safety is required, StringBuffer is the best option.

```java
StringBuffer buffer = new StringBuffer();
buffer.append("Hello ");
```

### `append()`
Updates the value of the object that invoked the method. This method accepts boolean, char, int, long, Strings, etc., and returns the updated StringBuffer object.

```java
StringBuffer buffer = new StringBuffer();
buffer.append("Hello ");
buffer.append("String");
buffer.append(" ");
buffer.append("Buffer");
System.out.println(buffer);
```

### `reverse()`
Reverses the value of the StringBuffer object that invoked the method. The method returns the string in reverse order.

```java
StringBuffer buffer = new StringBuffer();
buffer.append("Hello ");
buffer.append("String");
buffer.append(" ");
buffer.append("Buffer");
System.out.println(buffer.reverse());
```

## Regular Expressions

In Java, regular expressions represent a special sequence of characters - a pattern, that allows you to match or detect other strings or sets of strings based on the specialized syntax as a pattern. They can be used for searching, editing, or manipulating text and data.

```java
String pricePattern = "\\d+\\.?\\d{0,2}";
String numberPattern = "\\d+";
String emailPattern = "\\w+@\\w+.[a-z]{2,3}";
```

### Examples:

```java
String str = "Стоимость этой продукции 586 белорусских рублей";
String strPattern1 = "[0-9]"; //{1,2}, +
String strPattern2 = "\\d";
Pattern pattern = Pattern.compile(strPattern1);
Matcher matcher = pattern.matcher(str);
String numbers = "";
if (matcher.find()) {
    numbers = matcher.group();
}
System.out.println(numbers);
```

---

This concludes the lecture on Strings, StringBuilder, and StringBuffer. Please make sure to practice these concepts using the IntelliJ IDEA project provided on GitHub Classroom.