#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct t_rec{
 int id; char name[16];
 double ave; int game;
 struct t_rec *next;
 struct t_rec *front;
} Student;
Student *head=NULL;
Student *tale=NULL;

void ShowList(){
 Student *p;
 printf("Items in the list\n");
 p=head;
 while(p!=NULL){
  printf("%4d %16s %4.3lf %4d \n",p->id, p->name, p->ave, p->game);
  p=p->next;
 }
 return;
}
void Show(){
	Student *p;
 printf("Items in the list\n");
 p=tale;
 while(p!=NULL){
  printf("%4d %16s %4.3lf %4d \n",p->id, p->name, p->ave, p->game);
  p=p->front;
 }
 return;
}

void Append(int n, char *s, double d, int g){
 Student *p;
 if(head==NULL){
  head=(Student*) malloc(sizeof(Student));
  head->id=n; head->game=g; head->ave=d;
  strcpy(head->name,s);
  head->next=NULL;
  head->front=NULL;
 }
 else{
  p=head;
  while(p->next!=NULL) p=p->next;
  p->next=(Student*) malloc(sizeof(Student));
  p->next->front=p;
  p=p->next; p->id=n; p->game=g; p->ave=d;
  strcpy(p->name,s);
  tale=p;
  p->next=NULL;
  }
 return;
}
void InsertAfterMax(int id, char *s, double d, int g){
 double max=0.0;
 Student *p, *t;
 p=head;
 while(p->next!=NULL){
  if(max<p->ave)
   max=p->ave;
  p=p->next;
 }

 if(head->ave==max){
  t=head->next;
  head->next=(Student*) malloc(sizeof(Student));
  head->next->id=id; head->next->game=g; head->next->ave=d;
  strcpy(head->next->name,s);
  head->next->next=t;
 }
 else{
  p=head;
  while(p->ave==max){
  t=p->next->next;
  p=p->next;
  }
  p=(Student*) malloc(sizeof(Student));
  p->id=id; p->game=g; p->ave=d;
  strcpy(p->name,s);
  p->next=t;
 }
 return;
}
main(){
 Student *m;
 Append(1, "애니프로스트", 0.96, 98);
 Append(4, "잭말론", 0.567, 43);
 Append(3, "맥테일러", 0.876, 43);
 Append(8, "길그리썸", 0.365, 89);
 Append(9, "브렌다리존스", 0.789, 43);
 Append(6, "칼라이트만", 0.212, 69);
 Append(5, "질리안포스터", 0.333, 38);
 Append(7, "올리비아벤슨", 0.756, 67);
 Append(10, "엘리엇스테이블러", 0.555, 54);
 ShowList();
 Show();
 getchar();
}
