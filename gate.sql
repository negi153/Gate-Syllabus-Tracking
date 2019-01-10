drop database if exists gate;
create database gate;
use gate;

create table algo(id int(3)primary key,topics varchar(30),status varchar(3));
create table apti(id int(3)primary key,topics varchar(30),status varchar(3));
create table calculus(id int(3)primary key,topics varchar(30),status varchar(3));
create table cn(id int(3)primary key,topics varchar(30),status varchar(3));
create table co(id int(3)primary key,topics varchar(30),status varchar(3));
create table combin(id int(3)primary key,topics varchar(30),status varchar(3));
create table compiler(id int(3)primary key,topics varchar(30),status varchar(3));
create table dbms(id int(3)primary key,topics varchar(30),status varchar(3));
create table ds(id int(3)primary key,topics varchar(30),status varchar(3));
create table dsd(id int(3)primary key,topics varchar(30),status varchar(3));
create table linear(id int(3)primary key,topics varchar(30),status varchar(3));
create table os(id int(3)primary key,topics varchar(30),status varchar(3));
create table prob(id int(3)primary key,topics varchar(30),status varchar(3));
create table sets(id int(3)primary key,topics varchar(30),status varchar(3));
create table toc(id int(3)primary key,topics varchar(30),status varchar(3));


insert into algo values(1,"Time and Space","no"),
(2,"Sorting Techniques","no"),
(3,"Greedy algorithms","no"),
(4,"Searching Algorithms","no"),
(5,"Shortest paths in DAG","no"),
(6,"Dijkstra Algorithm","no"),
(7,"Bellman-ford algorithm","no"),
(8,"Longest common subsequence","no"),
(9,"Dynamic programming","no"),
(10,"Matrix chain multiplication","no"),
(11,"Subset sum","no"),
(12,"Multi stage graph","no"),
(13,"Knapsack","no"),
(14,"NP Completeness","no"),
(15,"Travelling salesman","no"),
(16,"Floyd Warshall","no");


insert into apti values(1,"averages","no"),
(2,"simple intrest","no"),
(3,"age","no"),
(4,"ratio and proportion","no"),
(5,"profit and loss","no"),
(6,"time and distance","no"),
(7,"partnership","no"),
(8,"time and work","no"),
(9,"mensuration","no"),
(10,"hcf and lcm","no"),
(11,"progression","no"),
(12,"verbal ability","no"),
(13,"data sufficiency","no"),
(14,"equations","no"),
(15,"data interpretation","no"),
(16,"alligation and mixture","no"),
(17,"surds and indice","no"),
(18,"alphabetic series","no"),
(19,"number system","no"),
(20,"number series","no"),
(21,"direction and distance","no"),
(22,"circular arragement","no"),
(23,"linear arragement","no"),
(24,"coded Inequalities","no"),
(25,"alphabet Test","no"),
(26,"ranking Odering","no"),
(27,"coding And Decoding","no"),
(28,"percentage","no"),
(29,"element Series","no"),
(30,"Blood Relation","no"),
(31,"Logarthims","no"),
(32,"Permutation and Combination","no");


insert into calculus values(1,"limits","no"),
(2,"integration","no"),
(3,"continuity","no"),
(4,"mean value theorem","no"),
(5,"maxima minima","no");


insert into cn values(1,"IP address","no"),
(2,"Flow Control methods","no"),
(3,"Error Control Methods","no"),
(4,"ISO OSI STACK","no"),
(5,"LAN technologies","no"),
(6,"Switching","no"),
(7,"Internet Protocol","no"),
(8,"Fragmentation","no"),
(9,"Protocols and Concepts","no"),
(10,"Routing","no"),
(11,"TCP","no"),
(12,"UDP","no"),
(13,"Hardware and various devices","no"),
(14,"Application protocols","no"),
(15,"Network Security","no"),
(16,"IPV6 and Wifi","no");


insert into co values(1,"Cache","no"),
(2,"Memory Interfacing","no"),
(3,"Machine instructions","no"),
(4,"ALU, Data","no"),
(5,"IO interface","no"),
(6,"Pipelining","no"),
(7,"Secondary memory","no");


insert into combin values(1,"prepositional calculus","no"),
(2,"Generating function","no"),
(3,"Recurrence relation","no");


insert into compiler values(1,"Syntax","no"),
(2,"Parsing","no"),
(3,"Code optimization","no"),
(4,"Intermediate code","no"),
(5,"phases of compiler","no"),
(6,"Runtime environments","no");


insert into dbms values(1,"ER MODEL","no"),
(2,"Relational Database","no"),
(3,"Conversion","no"),
(4,"Normalization","no"),
(5,"Relational Algebra","no"),
(6,"SQL","no"),
(7,"Transaction management","no"),
(8,"File structures","no"),
(9,"tuple calculus","no");


insert into ds values(1,"C programming","no"),
(2,"Types Operators","no"),
(3,"Flow Control","no"),
(4,"Functions","no"),
(5,"Pointers in C","no"),
(6,"Arrays","no"),
(7,"String","no"),
(8,"Storage Classes","no"),
(9,"Structure","no"),
(10,"Input and Output","no"),
(11,"File Input Output","no"),
(12,"Recursion","no"),
(13,"Linked List","no"),
(14,"Stacks and queues","no"),
(15,"Trees","no"),
(16,"Graphs","no"),
(17,"Hashing","no"),
(18,"Binary search","no"),
(19,"Disjoint sets","no");


insert into dsd values(1,"Logic functions","no"),
(2,"Minimization","no"),
(3,"Design and Synthesis","no"),
(4,"Sequential Circuits","no"),
(5,"Number system","no");



insert into linear values(1,"matrices","no"),
(2,"Determinants","no"),
(3,"Multiplication of Determinants","no"),
(4,"Cramers Rule","no"),
(5,"Inverse","no"),
(6,"Rank of a martix","no"),
(7,"linear homogenous equations","no"),
(8,"non-homogeneous equations","no"),
(9,"Eigen values","no"),
(10,"LU decomposition","no");


insert into os values(1,"Process Management","no"),
(2,"Syncronization","no"),
(3,"Deadlock","no"),
(4,"Memory Management","no"),
(5,"File system","no"),
(6,"inter process communication","no"),
(7,"Threads and system calls","no"),
(8,"cpu scheduling","no");


insert into prob values(1,"uniform,normal","no"),
(2,"Conditional Probability","no"),
(3,"exponential,poission","no"),
(4,"binomial","no"),
(5,"Total probability","no"),
(6,"Bayes theorem","no"),
(7,"Random variables","no"),
(8,"Expectation","no"),
(9,"Mean median","no");


insert into sets values(1,"Sets","no"),
(2,"Relations","no"),
(3,"first order logic","no"),
(4,"Partial order","no"),
(5,"Groups","no"),
(6,"Functions","no"),
(7,"graph","no"),
(8,"Rank of martix","no"),
(9,"Number system","no"),
(10,"Eigen values","no"),
(11,"LU decomposition","no");


insert into toc values(1,"DFA","no"),
(2,"PDA","no"),
(3,"pumping lemma","no"),
(4,"Turing machines","no"),
(5,"Countibality","no"),
(6,"Computability","no"),
(7,"Properties of CFL","no"),
(8,"Summary of closure","no"),
(9,"Properties of Regular","no"),
(10,"Regular Expressions","no"),
(11,"families","no"),
(12,"NFA","no"),
(13,"Epsilon NFA","no"),
(14,"Minimisation of DFA","no"),
(15,"Moore and Mealy","no");