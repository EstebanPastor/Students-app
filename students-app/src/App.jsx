import AppBar from "./components/AppBar";
import Student from "./components/Student";
import { Toaster } from "react-hot-toast";

const App = () => {
  return (
    <>
      <AppBar />
      <Student />
      <Toaster />
    </>
  );
};

export default App;
