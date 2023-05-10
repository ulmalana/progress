# Progress

A simple web app for tracking your learning progress. 

Made with [Biff](https://biffweb.com/) framework.


## Use case
* User can input their learning progress
* User can update their learning progress
  * Mark as complete/incomplete
  * Update the progress
* User can read their learning progress
* User can remove their learning progress

## Model
```clojure
{:learning-id uuid/int 
 :username string 
 :created-at date 
 :updated-at date 
 :learn string ;(name of what you learn)
 :source string ;(url/book/etc)
 :type string ;(course/book/etc) dropdown
 :notes string ; textarea
 :status string ;(complete/incomplete) dropdown
 }
```