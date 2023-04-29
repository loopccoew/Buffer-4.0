var firebaseConfig = {
    apiKey: "AIzaSyCeE9c3jX_LfBWjRd6Rv2O7KY5NGPKwh4o",
    authDomain: "teamloop-79b88.firebaseapp.com",
    projectId: "teamloop-79b88",
    storageBucket: "teamloop-79b88.appspot.com",
    messagingSenderId: "18214010600",
    appId: "1:18214010600:web:0818dfba3d291d1f51d35d"
};
// Initialize Firebase
firebase.initializeApp(firebaseConfig);

const auth = firebase.auth();

//signup function
function signUp() {
    var email = document.getElementById("email");
    var password = document.getElementById("password");

    const promise = auth.createUserWithEmailAndPassword(email.value, password.value);

    promise.catch(e => alert(e.message));
    alert("SignUp Successfully");
}

//signIN function
function signIn() {
    var email = document.getElementById("email");
    var password = document.getElementById("password");
    const promise = auth.signInWithEmailAndPassword(email.value, password.value);
    promise.then(() => {
        window.location.href = "registration.html";
    })
    .catch(e => alert(e.message));

}


//signOut

function signOut() {
    auth.signOut();
    alert("SignOut Successfully from System");
}

//active user to homepage
firebase.auth().onAuthStateChanged((user) => {
    if (user) {
        var email = user.email;
        alert("Your account has been created!!! " + email);

    } else {
        alert("No Active user Found")
    }
})