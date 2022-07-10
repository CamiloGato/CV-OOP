#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int main(){
    int x;
    cin >> x;
    vector<float> nums;

    for (int i = 0; i < x; i++) {
        float num;
        cin >> num;
        nums.insert(nums.end(),num);
    }

    vector<float> copyNums(nums);
    sort(nums.begin(), nums.end());

    for (int i = 0; i < x; i++) {
        cout << distance(copyNums.begin(), find(copyNums.begin(), copyNums.end(), nums.at(i))) + 1 << endl;
    }
}