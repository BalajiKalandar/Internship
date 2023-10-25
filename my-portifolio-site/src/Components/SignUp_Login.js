import React from 'react'
import './Login.css';
import { Link } from 'react-router-dom';
export default function SignUp_Login() {
  return (
    <div class="header_14">

    <div class="HeaderMenu">
        
        <span ><Link to="/" style={{color:"white"}}>Back to Home</Link></span>

    </div>



    <div class="Text">
        <h2>Welcmome back to Martex</h2>
        <h5>The most important part of the Startup is the samples. The samples form a set of 25 usable pages you can
            use as is or you can add new blocks.</h5>
        <div class="Middle-Fill">
            <div class="Rectangle">
                <button>
                    Learn More
                </button>
            </div>

        </div>
    </div>

    <div class="SignUpFrom">
        <div class="SingUp">
            <h3>Sing Up Now</h3>
        </div>
        <div class="inputName">
            <input type="text" placeholder="Your name"/>
        </div>
        <div class="inputName">
            <input type="text" placeholder="Your password"/>
        </div>


        <div class="Checked">
            <input type="checkbox"/>
            <span id="spn">I agree to the Terms of Service</span>
        </div>
        <div class="SignIn">
            <button>Sign In</button>
        </div>
        <div class="Divide">

            <div class="horizontle-line"></div>
            <div class="text">or</div>
            <div class="horizontle-line"></div>

        </div>
        <div class="SignIn1">
            <button>Login via Twitter</button>
        </div>

        <div class="NoAccount">

            <span>Do you have an Account?</span>
            <a href=""> Sign In</a>
        </div>


    </div>


</div>
  )
}
