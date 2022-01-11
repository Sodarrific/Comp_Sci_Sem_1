// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Gnoblin"<<endl;
	int x = 0;
	char y = 'x';
	while(true){
		if(x==100){
			break;
		}
		cout<<"gnomes";
		
		cin>>y;
		if(y == 'q'){
			break;
		}
		x = x + 1;
	}
	cout<<"cope";
}
