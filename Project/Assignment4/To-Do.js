const inputText = document.getElementById("inputItem")
const listContainer = document.getElementById("listItem")
function myFunction(){
    if(inputText.value === ''){
        alert("Add Your Task..");
    }else{
        let val = document.createElement("li");
        val.innerHTML = inputText.value;
        listContainer.appendChild(val);

        deleteVal(val)
    }
}

function deleteVal(val){
    const deleteBtn = document.createElement('button');
    deleteBtn.innerHTML = 'Delete';
    val.appendChild(deleteBtn);
    deleteBtn.onclick = function(){
        val.remove();
    }

}