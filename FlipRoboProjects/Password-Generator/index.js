document.addEventListener("DOMContentLoaded", function () {
    const generateButton = document.getElementById("generate-button");
    const passwordLengthInput = document.getElementById("password-length");
    const generatedPasswordOutput = document.getElementById("generated-password");
    const passwordStrengthOutput = document.getElementById("password-strength");

    generateButton.addEventListener("click", function(){
        console.log(typeof(passwordLengthInput.value));
            const passwordLength = parseInt(passwordLengthInput.value);
            console.log(typeof(passwordLength));
    
            if (passwordLength < 8 || passwordLength > 16) {
                alert("Password length must be between 8 and 16 characters.");
                return;
            }
    
            const charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+[]{}|;:,.<>?";
            let newPassword = "";
      
            for (let i = 0; i < passwordLength; i++) {
                const randomIndex = Math.floor(Math.random() * charset.length);
                newPassword += charset[randomIndex];
            }
    
            generatedPasswordOutput.textContent = `Generated Password: ${newPassword}`;
            console.log(generatedPasswordOutput.textContent)
            console.log("hi")
            generatedPasswordOutput.innerText=newPassword;
            passwordStrengthOutput.textContent = `Password Strength: ${checkPasswordStrength(newPassword)}`;
            console.log(passwordStrengthOutput.textContent)
            generatedPasswordOutput.style.display = "block";
            passwordStrengthOutput.style.display = "block";
            document.getElementById("password-output").style.display="block";
    });

    // function generatePassword() {
    //     const passwordLength = parseInt(passwordLengthI"nput.value);

    //     if (passwordLength < 8 || passwordLength > 16) {
    //         alert("Password length must be between 8 and 16 characters.");
    //         return;
    //     }

    //     const charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+[]{}|;:,.<>?";
    //     let newPassword = "";

    //     for (let i = 0; i < passwordLength; i++) {
    //         const randomIndex = Math.floor(Math.random() * charset.length);
    //         newPassword += charset[randomIndex];
    //     }

    //     generatedPasswordOutput.textContent = `Generated Password: ${newPassword}`;
    //     passwordStrengthOutput.textContent = `Password Strength: ${checkPasswordStrength(newPassword)}`;
    //     generatedPasswordOutput.style.display = "block";
    //     passwordStrengthOutput.style.display = "block";
    // }

    function checkPasswordStrength(password) {
        if (password.length < 8) {
            return "Very Weak";
        } else if (password.length <= 10) {
            return "Weak";
        } else if (password.length <= 13) {
            return "Medium";
        } else if (password.length <= 16) {
            return "Strong";
        } else {
            return "Very Strong";
        }
    }
});
