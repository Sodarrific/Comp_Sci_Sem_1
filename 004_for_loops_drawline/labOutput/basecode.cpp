// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symb;
	int amou;
	char vhd;
	int count = 0;
	cout<<"Enter symbol: ";
	cin>>symb;
	cout<<"Enter amount in number: ";
	cin>>amou;
	cout<<"Enter if v, h, or d: ";
	cin>>vh;
	if(vh=='v'){
		while(true){
			cout<<symb<<endl;
			count = count + 1;
			if(count==amou){
				break;
			}
		}
	}
	if(vh=='h'){
		while(true){
			cout<<symb;
			count = count + 1;
			if(count==amou){
				break;
			}
		}
	}

}
