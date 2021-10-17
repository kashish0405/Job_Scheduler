# Job Scheduler

## Problem Statement
Create a job scheduler for XYZ company which is building a new operating system. Each Job will belong to a Project and created by an User. The name of the Jobs will be unique. When the processor is idle, dispatch a new job if its running time is less than the current budget of the Project. Successfully running a Job, will reduce the budget of that project by running time of the project. <br/>

All the projects will be stored in a Trie, using the project name as the key. Project names will be unique. All the Jobs will be stored in a Priority Queue, specifically a Max-Heap, using their priorities as the key.

All times are in milliseconds (ms)

## Requirements
The requirements of the scheduler are - 

1. USER: Create the user with given user name.
2. PROJECT: Create a project. NAME PRIORITY BUDGET
3. JOB: Create a job. NAME PROJECT USER RUNTIME
4. QUERY: Return the status of the Job queried.
5. ADD: Increase the budget of the project. PROJECT BUDGET
6. EMPTY LINE: Let the scheduler execute a single JOB.
## Implementation

Following data structures *(coded from scratch)* are implemented as part of this project to build the scheduler:

<!--Red-Black Tree: The key of the red-black tree is name_job . Since name_job is unique, it will take O(log n) time to search a job. Red-Black tree ensures that it will remain balanced so there is a performance improvement as compared to using plane Binary Search Tree. The node maintains a list of Jobs corresponding t.-->
**Max Heap using Priority Queue**: The key of Max Heap is assigned as priority of the job. So, whenever extractMax() is called, it will correspond to highest priority job among all jobs. Running Time of job is checked compared with the budget of the project fetched from RB-Tree. 
<!--//The nodes are designed in such a way that every Red-Black node will contain object reference of corresponding Max-Heap node and vice-versa. Hence, whenever there is an insert operation, nodes will be inserted in both the data structures and will point to each other.-->
**Trie**: All Projects are stored in a Trie using project name as the key.This data structure enables efficient information reTrieval. Using Trie, search complexities were brought to optimal limit.
<!--//Global time counter is a simple int variable that simulates current system time. At every unit of time, first it is checked if there is any command to be executed, then current job details are updated.-->
