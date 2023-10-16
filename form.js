// Initialize an object to store form data
const formData = {
    firstName: "",
    lastName: "",
    dob: "",
    country: "",
    gender: [],
    profession: "",
    email: "",
    mobile: ""
};

// Function to submit the form and display the results
function submitForm() {
    for (const key in formData) {
        const inputElement = document.getElementById(key);
        if (inputElement) {
            formData[key] = inputElement.value;
        }
    }

    const submittedData = [];
    for (const key in formData) {
        const label = key.replace(/([A-Z])/g, " $1").toLowerCase();
        const value = formData[key];
        submittedData.push("<strong>${label}:</strong> ${value}");
    }

    document.getElementById("submittedData").innerHTML = submittedData.join("<br>");
    document.getElementById("popup").style.display = "block";
    resetForm();
}

// Function to reset the form
function resetForm() {
    for (const key in formData) {
        const inputElement = document.getElementById(key);
        if (inputElement) {
            inputElement.value = "";
        }
    }
}

// Function to close the popup
function closePopup() {
    document.getElementById("popup").style.display = "none";
}

window.onclick = function(event) {
    if (event.target === document.getElementById("popup")) {
        closePopup();
    }
}
