#include<stdio.h>
#include<stdlib.h>
int main()
{
if(signal(SIGALARM,sig_alaram)==sig_error)
{
printf("signal error");
alarm(5);
for(n=0;n<=15;n++)
{
printf("from n loop %d...\n");
printf("main program terminated");
}
else
{
printf("from n loop");
}
}
}
