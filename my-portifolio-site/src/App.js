import './App.css';
import Navbar from './Components/Navbar';
import { BrowserRouter,Route,Routes} from 'react-router-dom';
import SignUp_Login from './Components/SignUp_Login';
function App() {
  return (
    // <Navbar/>
    <BrowserRouter>
    <Routes>

      <Route path='/' element={ <Navbar/>}></Route>
      <Route path='/SignUp' element={ <SignUp_Login/>}></Route>

      
    </Routes>
    </BrowserRouter>
   
  );
}

export default App;
