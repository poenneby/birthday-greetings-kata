# Birthday Greetings Kata


## Problem
write a program that:
- Loads a set of contact records from a flat file
- Sends a greetings email to all contacts whose birthday is today
- The flat file is a sequence of records, separated by newlines; 

these are the first few lines:

```
last_name, first_name, date_of_birth, email
Doe, John, 1982/10/08, john.doe@foobar.com
Ann, Mary, 1975/09/11, mary.ann@foobar.com
Doe, Jane, 1974/03/13, jane.doe@foobar.com
```

The greetings email should contain the following text:

```
To: <email>
Subject: Happy birthday!

Body:
Happy birthday, dear <first_name>!
```

with the `email` and `first_name` of the contact substituted with those of the birthday person

### Notes

The participant can print to system out instead of actually sending emails

## Evolution

Make the program send a `single` email reminder to all but the contact whose birthday is today


Example:

It is John Doe's birthday - Ann and Jane gets an email reminder.

The reminder email should contain the following text:

```
To: <email>
Subject: Birthday reminder!

Today is <first_name>'s birthday!
```

with the `email` and `first_name` of the contact substituted for accordingly


