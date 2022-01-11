// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int cope = 5;
	int seethe = 15;
	while(true){
		if(cope==25){
			cout<<cope<<endl;
			break;
		}
		cout<<cope<<endl;
		cope = cope + 1;
	}
	cout<<"-----------------------------------"<<endl;
	for(int seethe = 15; seethe >= 5; seethe = seethe - 1){
		cout<<seethe<<endl;
	}

}
